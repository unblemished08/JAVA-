import java.util.*;
public class JobSequencing {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            profit = p;
            deadline = d;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][]={{4,2000},{1,1000},{2,1500},{3,1800}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobsInfo.length;i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);
        //descending order of profit

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++) {
            Job curr=jobs.get(i);
            if(curr.deadline>time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max job = "+seq.size());
        for(int i=0;i<seq.size();i++) {
            System.out.print(seq.get(i)+" ");
        }
    }
}