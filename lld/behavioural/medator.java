public interface Colleague {
    public void placeBid(int bid);
    public void receiveNotificationBid(int bid);
    String getName();
}

public class Bidder implements Colleague {
    String name;
    Mediator mediator;

    public Bidder(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void placeBid(int bid) {
        mediator.placeBid(bid, this);
    }

    @Override
    public void receiveNotificationBid(int bid) {
        System.out.println("Notification for " + this.name + " : New bid of " + bid + " has been placed");
    }
    @Override
    public String getName() {
        return this.name;
    }
}

public interface Mediator {
    public void placeBid(int bid, Colleague colleague);
    public void addBidder(Colleague colleague);
}

public class AuctionMediator implements Mediator {
    List<Colleague> colleagues;

    public AuctionMediator() {
        colleagues = new ArrayList<>();
    }

    @Override
    public void placeBid(int bid, Colleague colleague) {
        colleagues.forEach(c -> {
            if (!c.getName().equals(colleague.getName())) {
                c.receiveNotificationBid(bid);
            }
        });
    }

    @Override
    public void addBidder(Colleague colleague) {
        colleagues.add(colleague);
    }
}

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();
        Colleague bidder1 = new Bidder("Bidder 1", mediator);
        Colleague bidder2 = new Bidder("Bidder 2", mediator);
        Colleague bidder3 = new Bidder("Bidder 3", mediator);
        mediator.addBidder(bidder1);
        mediator.addBidder(bidder2);
        mediator.addBidder(bidder3);
        bidder1.placeBid(100, bidder1);
        bidder2.placeBid(200, bidder2);
        bidder3.placeBid(300, bidder3);
    }
}