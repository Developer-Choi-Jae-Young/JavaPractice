package practice2;

public class Variable2 {

	public static void main(String[] args) {
		// 1. 대소문자가 구분된다. (길이 제한 X)
		int num = 10;
		int nuM = 20;
		System.out.println(num);
		System.out.println(nuM);
		
		//2. 예약어를 사용하면 안된다.
		
		//int class;
		
		//3. 숫자로 시작하면 안된다.
		
		// int 1age; X 
		int age1;
		
		//4. 특수문자는 '_' 와 '$'만 가능
		// String sh@rp;
		String $harp;
		
		/*5. 카멜케이스 : 소문자로 시작하여 
		다음단어의 첫글자가 대문자로 작성
		*/
		// 회원이름 
		String userName; 
		String username; /*문법상 오류는 아니나, 추후 
		환경에 따라 문제가 발생할수 있음*/
		//제품(produck)의 번호(id) = 정수형
		int produckId;
		// 책(book)의 제목(title) => 문자열
		String bookTitle;
		
		/*string str = "기차"
		 string str = "기차" + "칙칙폭폭";
		 string str = "기차" + 123 + 45 + "출발"
		 string str = 123 + 45 + "기차" + "출발"
		 */
		
	
		
		
		
	}

}
