package productOrder.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import mainController.MainController;

public class ProductOrderMainMenu {

	// variable
	private Scanner keyboard;
	
	// constructor
	public ProductOrderMainMenu() {
	
		this.keyboard = new Scanner(System.in);
		
	}
	
	
	// 상품 주문 메뉴 호출 
	public void productOrderMainMenu() {
		
		int selectedMenu = 0;
		
		while(true){
			
			System.out.println("상품 주문 메뉴 입니다");
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.println("1. 상품 주문  2. 주문한 내역 보기  3. 상품 주문 수정  4. 상품 주문 취소  5. 상품 주문 결제  6. 결제 내역 확인  7. 나가기");
			
			try{
				selectedMenu = keyboard.nextInt();	
			} catch(InputMismatchException e) {
				System.out.println("1번부터 4번까지 숫자를 입력해 주십시오");
				MainController.getProductOrderController().requestProductOrderMainMenuView();
			}
			
			if(selectedMenu == 1){
				
				// 상품주문 메뉴로 이동
				MainController.getProductOrderController().requestCheckUserPhoneNumber();
				
			} else if(selectedMenu == 2){
				
				// 주문내역 확인하는 뷰 요청
				MainController.getProductOrderController().requestProductOrderListView();
				
			} else if(selectedMenu == 3){
				
				// 상품 주문 수정 메뉴로 이동
				MainController.getProductOrderController().requestProductOrderUpdateView();
				
			} else if(selectedMenu == 4){
				
				// 상품 주문 취소 메뉴로 이동
				MainController.getProductOrderController().requestProductOrderCancelView();
				
			} else if(selectedMenu == 5){
				
				// 상품 주문 결제 메뉴로 이동
				MainController.getProductPaymentController().requestProductPaymentView();
				
			} else if(selectedMenu == 6){
				
				// 결제 내역 확인하는 뷰 요청
				MainController.getProductPaymentController().requestProductPaymentListView();
				
			} else if(selectedMenu == 7){
				
				break;
				
			} else {
				
				System.out.println("잘못 입력하셨습니다");
				
			}
			
		}
				
	}
	
}




