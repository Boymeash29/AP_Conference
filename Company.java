public class Company {

	private String lastName;
	private String firstName;
	private int table;
	private int seatNum;
	private int company;

	public Attendee(String initLastName, String initFirstName, int initCoId) {

		lastName = initLastName;
		firstName = initFirstName;
		company = initCoId;

	}

	public String getName() { return firstName + " " + lastName; }

	public String getLastName() { return lastName; }

	public String getFirstName() { return firstName; }

	public int getTable() { return table; }

	public int getSeat() { return seatNum; }

	public int getCompany() { return company; }

	public void setTable(int newTable) { table = newTable; }

	public void setSeat(int newSeat) { seatNum = newSeat; }

	public String toString() {
		return getName();
	}
  
}