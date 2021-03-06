package ingredientOrder.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import mainController.MainController;

public class IngredientOrderMainMenu {

	// variable
	private Scanner keyboard;
	
	// constructor
	public IngredientOrderMainMenu() {
	
		this.keyboard = new Scanner(System.in);
		
	}
	
	
	// 원재료 주문 메뉴 호출 
	public void ingredientOrderMainMenu() {
		
		int selectedMenu = 0;
		
		while(true){
			
			System.out.println("원재료 주문 메뉴 입니다");
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.println("[1]. 원재료 주문  [2]. 주문한 내역 보기  [3]. 원재료 주문 삭제    [4]. 나가기");
			
			try{
				selectedMenu = keyboard.nextInt();	
			} catch(InputMismatchException e) {
				System.out.println("1번부터 6번까지 숫자를 입력해 주십시오");
				MainController.getIngredientOrderController().requestIngredientOrderMainMenuView();
			}
			
			if(selectedMenu == 1){
				
				MainController.getIngredientOrderController().requestIngredientOrderView();
				
			} else if(selectedMenu == 2){
				
				MainController.getIngredientOrderController().requestOrderIngredientList();
				MainController.getIngredientPaymentController().ingredientPayment();
			
				
			} else if(selectedMenu == 3){
				
				MainController.getIngredientOrderController().requestOrderIngredientDeleteView();
				
				
			} else if(selectedMenu == 4){
				
				MainController.getIngredientController().requestIngredientMainMenu();
				
			} else {
				
				System.out.println("잘못 입력하셨습니다");
				break;
				
			}
			
		}
				
	}
	
}




