package by.savik.L24_03_2025.OnlineShop;

import java.util.*;

public class TicketManager {
    private List<Ticket> soldTickets = new ArrayList<>();


    public void sellTicket(String name, TicketType type) {
        Ticket ticket = new Ticket(name, type);
        soldTickets.add(ticket);
    }

    public void printAllSales() {
        for (Ticket ticket : soldTickets) {
            System.out.println(ticket.toString());
        }
    }

    public Map<TicketType, Long> countByType() {
        EnumMap<TicketType, Long> ticketsByType = new EnumMap<>(TicketType.class);
        for (Ticket ticket : soldTickets) {
            TicketType ticketType = ticket.getType();
            if (ticketsByType.containsKey(ticketType)){
                ticketsByType.put(ticketType, ticketsByType.get(ticketType)+1L);
            }
            else {
                ticketsByType.put(ticketType, 1L);
            }
        }
        return ticketsByType;
    }

    public int totalRevenue(){
        int totalRevenue = 0;
        for (Ticket ticket : soldTickets){
            totalRevenue += ticket.getType().getPrice();
        }
        return totalRevenue;
    }

    public Set<String> getVIPBuyers(){
        Set<String> vipBuyers = new HashSet<>();
        for (Ticket ticket : soldTickets) {
            if (ticket.getType() == TicketType.VIP){
                vipBuyers.add(ticket.getBuyerName());
            }
        }
        return vipBuyers;
    }


}