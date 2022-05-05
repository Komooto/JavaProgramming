package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner po;
    public BusinessAnalyst ba;
    public ScrumMaster st;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner po, BusinessAnalyst ba, ScrumMaster st) {
        this.po = po;
        this.ba = ba;
        this.st = st;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p -> p.id == id);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(int id){
        developers.removeIf(p -> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "po=" + po.name +
                ", ba=" + ba.name +
                ", st=" + st.name +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
