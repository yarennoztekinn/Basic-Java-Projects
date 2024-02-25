import java.util.Random;

public class ID {
	private int ID;
	
	private String name;
	
	private String identificationNumber;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}
	
	boolean control = true;
	
	public void setIdentificationNumber(String identificationNumber) {
		if (identificationNumber.length() == 11) {
			for(int i = 0; i < identificationNumber.length(); i++) {
				
				char character = identificationNumber.charAt(i);
				// identificationNumber Stringindeki i indexli karakteri(char tipinde) character adıyla alır
				if (Character.isDigit(character)) {
					control = true;
				}
				else {
					control = false;
					break;
				}
			}
			if (control) {
				Random random = new Random();
				// random statik tanımlanmadığı için kullanmadan önce nesne oluşturmalıyız.
				// ama Math sınıfı  static olduğu için nesne oluşturmaya gerek yok. Direkt class ismiyle çağırılabilir
				
				int boxOfficeNum = random.nextInt(100);
				printTheResult("Box office number: " + boxOfficeNum);
				
			}else {
				printTheResult("Please Enter all characters as numbers");
			}
		}else {
			printTheResult("identification number should be 11 digits!");
		}	
		this.identificationNumber = identificationNumber;
	}
	public void printTheResult(String result) {
		System.out.println(result);
	}

}
