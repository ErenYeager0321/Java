package T7_This_Constructor_Chaining;

class HotelRoom {
	String roomType;
	double roomRate;
	int roomNumber;
	
	public HotelRoom(String roomType) {
		this(roomType, 100.0, 0); // Default rate and room number
	}
	
	public HotelRoom(String roomType, double roomRate) {
		this(roomType, roomRate, 0); // Default room number
	}
	
	public HotelRoom(String roomType, double roomRate, int roomNumber) {
		this.roomType = roomType;
		this.roomRate = roomRate;
		this.roomNumber = roomNumber;
	}
	
	public void displayRoomDetails() {
		System.out.println("Room Type: " + roomType);
		System.out.println("Room Rate: $" + roomRate);
		System.out.println("Room Number: " + roomNumber);
	}
}

public class P2_Hotel_Booking {
	public static void main(String[] args) {
		HotelRoom room1 = new HotelRoom("Standard");
		HotelRoom room2 = new HotelRoom("Deluxe", 150.0);
		HotelRoom room3 = new HotelRoom("Suite", 300.0, 101);
		
		room1.displayRoomDetails();
		room2.displayRoomDetails();
		room3.displayRoomDetails();
		}
}
