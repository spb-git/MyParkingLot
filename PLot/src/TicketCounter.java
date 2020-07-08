
public class TicketCounter {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Vehicle vehicle= new Vehicle();
	vehicle.vehicleNumber="ad1";
	vehicle.vehicleType="Two wheeler";
	//Issue ticket
	TicketDetails ticket= issueTicket(vehicle);
	//Collect ticket
	ticket= collectTicket(vehicle,ticket);

		}

		private static TicketDetails collectTicket(Vehicle vehicle, TicketDetails ticket) {
			ticket.departedTime=new Date();
			ticket.duration=(int)(ticket.departedTime.getTime()-ticket.arrivedTime.getTime());
			return ticket;
		}

		private static TicketDetails issueTicket(Vehicle vehicle) {
			TicketDetails ticket=new TicketDetails();
			ticket.arrivedTime=new Date();
			ticket.vehicleNumber=vehicle.vehicleNumber;
			ticket.vehicleType=vehicle.vehicleType;
			if(vehicle.vehicleType.equals("Two wheeler"))
			{
				ticket.slot=1;
			}
			else if (vehicle.vehicleType.equals("Four wheeler"))
			{
				ticket.slot=2;
			}
			else 
			{
				ticket.slot=3;
			}
			
			return ticket;
		}

	}


