abstract class Person {
    private String name;
    private int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public abstract void displayRole();
}

class Voter extends Person {
    private boolean hasVoted;

    Voter(String name, int id) {
        super(name, id);
        this.hasVoted = false;
    }

    public boolean hasVoted() {
        return this.hasVoted;
    }

    public void vote() {
        this.hasVoted = true;
    }

    @Override
    public void displayRole() {
        System.out.println("Voter: " + getName());
    }
}

class Candidate extends Person {
    private int votes;

    Candidate(String name, int id) {
        super(name, id);
        this.votes = 0;
    }

    public void addVote() {
        this.votes++;
    }

    public int getVotes() {
        return this.votes;
    }

    @Override
    public void displayRole() {
        System.out.println("Candidate: " + getName());
    }
}

class VotingSystem {

    public void castVote(Voter v, Candidate c) {
        if (v.hasVoted()) {
            System.out.println(v.getName() + " has already voted");
        } else {
            v.vote();
            c.addVote();
            System.out.println(v.getName() + " voted for " + c.getName());
        }
    }

    public void showResult(Candidate c1, Candidate c2) {
        System.out.println("\n--- Results ---");
        System.out.println(c1.getName() + " -> " + c1.getVotes());
        System.out.println(c2.getName() + " -> " + c2.getVotes());
    }
}

public class Main {
    public static void main(String[] args) {

        Candidate c1 = new Candidate("Alice", 101);
        Candidate c2 = new Candidate("Bob", 102);

        Voter v1 = new Voter("John", 1);
        Voter v2 = new Voter("Sam", 2);

        VotingSystem vs = new VotingSystem();

        vs.castVote(v1, c1);
        vs.castVote(v1, c2); 
        vs.castVote(v2, c2);

        vs.showResult(c1, c2);

    
        Person p1 = v1;
        Person p2 = c1;

        p1.displayRole();
        p2.displayRole();
    }
}