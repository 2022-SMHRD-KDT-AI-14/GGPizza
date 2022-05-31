package StartSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class MemberDAO {
	int cnt;
	MemberDTO dto = new MemberDTO(null, null);
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs; // Query�� ������� �޾ƿ��� ��ü
	
public void select() {
		
		// ���� ó�� �ϴ� ����
		// 1) ����ڰ�(Ȥ�� �����ڰ�) �߻���ų �� �ִ�
		// ���� ��Ȳ �߻� ��
		// �� �̿��� �ڵ���� �����Ѱ� �����ϱ� ���ؼ�				
		// 2) compile���� �߻��ϴ� ����		
		
		//1. �����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. DB ����
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn != null) {
				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. SQL�� ����
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			System.out.print("ID"+"\t");
			System.out.print("PW"+"\t");
			System.out.println("NAME");
	
			while(rs.next()) {
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			System.out.print(id+"\t");
			System.out.print(pw+"\t");
			System.out.println(name);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//4. ��������
			try {
				if(rs != null) {
					rs.close();
				}
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		System.out.println("Hello World");
	}

	
	public void selectName(String id){
		// 1. �����ε�
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̺� ���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		// 2. DB ����
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn != null) {
				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL�� ����
		String sql = "select NAME from member where id = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			// ?�� �ݵ�� excute���� ������ �Ǿ���Ѵ�
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString(1);
				System.out.println(id+"�� �ش��ϴ� �̸���"+name+"�Դϴ�");
			}
	
			} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(psmt != null) {
					rs.close();
				}
				if(conn != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// 4. ��������
		
		System.out.println("�赿��");
		
	}

	
	public void login(MemberDTO dto){
		// 1. �����ε�
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("����̺� ���� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		// 2. DB ����
		
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_5";
		String db_pw = "smhrd5";
		
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn != null) {
//				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL�� ����
		
		// member ���̺��� PW Column SELECT
				// ID�� ���� id�� ��
				// ����� pw�� ���ؼ�
				// ��ġ�ϸ� "�α��� ����"
				// ��ġ���� ������ "�α��� ����"
		String sql = "select PW from member where id = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			// ?�� �ݵ�� excute���� ������ �Ǿ���Ѵ�
			psmt.setString(1, dto.getId());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String result = rs.getString(1);
				if(dto.getPw().equals(result)) {	
					System.out.println("�α��� ����");
				}else {
					System.out.println("�α��� ����");
				}
			}
	
			} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(psmt != null) {
					rs.close();
				}
				if(conn != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// 4. ��������
		
//		System.out.println("�����");
		
	}


	public int insert(MemberDTO dto) {
		// 1. ���� �ε�
		// 1-1. ojdbc6.jar ���� �߰�!!
		// ���� �ε��� Class File ã��!!
		int cnt = 0;
		Connection conn = null; 
		PreparedStatement psmt = null; 
		
		try {
			// ������(compile) ���Ŀ� �� �� �ִ� �����鿡 ���ؼ���
			// ����ó���� ����� �Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			// 2. DB ����
			// 1) url 2) db_id 3) db_pw
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_e_0516_5";
			String db_pw = "smhrd5";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			// !conn.isClosed()
			if(conn != null) {
				System.out.println("���� ����");
			}
			
			// 3. SQL�� ����
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			
			String sql = "insert into member values(?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			
			// sql���� �����ϱ� ���� ?�� ä����
			cnt = psmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("ȸ������ ����");
		} finally {
			// 4. ���� ���� : �������� �ݴ´�!!
			// pmst �ݱ�!
			
			try {
				if(psmt != null) {
					psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return cnt;
	}

	
	public int rank() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // ex) sc.nextInt
		}
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // db �ּ�
		String db_id = "hr"; // db_id
		String db_pw = "hr"; // db_pw
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL�� ����
//		String sql = "select PW from member order by PW desc";
//		String sql = "select rownum as rank, PW from (select PW from member order by PW desc)";
<<<<<<< HEAD
		String sql = "select rownum as rank, ID, MaxMoney from (select ID, max(Money) as MaxMoney from member group by ID order by max(Money) desc) where rownum<11";
=======
		String sql = "select rownum as rank, ID, MaxMoney from (select ID, max(PW) as MaxMoney from member group by ID order by max(PW) desc) where rownum<11";
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-AI-14/GGPizza.git
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
//			System.out.printf("rank");
            System.out.printf("%10s","[Rank]");
            System.out.printf("%15s","[ID]");
<<<<<<< HEAD
            System.out.printf("%15s","[Money]");
=======
            System.out.printf("%15s","[PW]");
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-AI-14/GGPizza.git
            System.out.println();
			
			while (rs.next()) {
//				String pw = rs.getString(1);
//				System.out.printf("\n" + pw);
                String rank = rs.getString(1);
                String id = rs.getString(2);
                String pw = rs.getString(3);
                System.out.printf("%7s",rank);
<<<<<<< HEAD
                System.out.printf("%12s",id);
                System.out.printf("%15s",pw);
=======
                System.out.printf("%20s",id);
                System.out.printf("%13s",pw);
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-AI-14/GGPizza.git
                System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}
}










