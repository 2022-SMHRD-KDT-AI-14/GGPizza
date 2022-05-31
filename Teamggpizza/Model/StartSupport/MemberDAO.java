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
	ResultSet rs; // Query의 결과값을 받아오는 객체
	
public void select() {
		
		// 예외 처리 하는 이유
		// 1) 사용자가(혹은 개발자가) 발생시킬 수 있는
		// 예외 상황 발생 시
		// 그 이외의 코드들을 안전한게 진행하기 위해서				
		// 2) compile이후 발생하는 오류		
		
		//1. 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. DB 연결
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn != null) {
				System.out.println("DB 연결 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. SQL문 실행
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
			//4. 연결종료
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
		// 1. 동적로딩
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		// 2. DB 연결
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn != null) {
				System.out.println("DB 연결 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL문 실행
		String sql = "select NAME from member where id = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			// ?는 반드시 excute전에 설정이 되어야한다
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString(1);
				System.out.println(id+"에 해당하는 이름은"+name+"입니다");
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
		
		// 4. 연결종료
		
		System.out.println("김동훈");
		
	}

	
	public void login(MemberDTO dto){
		// 1. 동적로딩
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이브 연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		// 2. DB 연결
		
		String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
		String db_id = "campus_e_0516_5";
		String db_pw = "smhrd5";
		
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn != null) {
//				System.out.println("DB 연결 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL문 실행
		
		// member 테이블의 PW Column SELECT
				// ID의 값이 id인 것
				// 결과와 pw를 비교해서
				// 일치하면 "로그인 성공"
				// 일치하지 않으면 "로그인 실패"
		String sql = "select PW from member where id = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			// ?는 반드시 excute전에 설정이 되어야한다
			psmt.setString(1, dto.getId());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String result = rs.getString(1);
				if(dto.getPw().equals(result)) {	
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
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
		
		// 4. 연결종료
		
//		System.out.println("배고파");
		
	}


	public int insert(MemberDTO dto) {
		// 1. 동적 로딩
		// 1-1. ojdbc6.jar 파일 추가!!
		// 동적 로딩할 Class File 찾기!!
		int cnt = 0;
		Connection conn = null; 
		PreparedStatement psmt = null; 
		
		try {
			// 컴파일(compile) 이후에 알 수 있는 에러들에 대해서도
			// 예외처리를 해줘야 한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// 2. DB 연결
			// 1) url 2) db_id 3) db_pw
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_e_0516_5";
			String db_pw = "smhrd5";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			// !conn.isClosed()
			if(conn != null) {
				System.out.println("접속 성공");
			}
			
			// 3. SQL문 실행
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			
			String sql = "insert into member values(?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			
			// sql문을 실행하기 전에 ?를 채우자
			cnt = psmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("회원가입 실패");
		} finally {
			// 4. 연결 종료 : 역순으로 닫는다!!
			// pmst 닫기!
			
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
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // db 주소
		String db_id = "hr"; // db_id
		String db_pw = "hr"; // db_pw
		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 3. SQL문 실행
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










