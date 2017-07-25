package gantt;

import java.util.ArrayList;
import java.util.Date;

public class Theme {
    private String name;
    private ArrayList<Task> taskList;

    private Date olderDate;
    private Date earlierDate;

    public void addTasks(ArrayList<Task> list) {
        taskList = list;
        Date older, earlier,tempDate;
        older = taskList.get(0).getDateStart();
        earlier = taskList.get(0).getDateStart();

        for (int i = taskList.size() - 1; i != 0; i--){
            tempDate = taskList.get(i).getDateStart();

            long plusTime = Integer.parseInt(taskList.get(i).getDuration()) * 86400000;
            Date tempOlder = new Date();
            tempOlder.setTime(tempDate.getTime() + plusTime);

            if (older.before(tempOlder))
                older = tempOlder;

            if (earlier.after(tempDate))
                earlier = tempDate;
        }

        olderDate = older;
        earlierDate = earlier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOlderDate(){
        return olderDate;
    }

    public Date getEarlierDate(){
        return  earlierDate;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nTheme{");
        result.append(taskList.toString());
        result.append("\n}");
        return result.toString();
    }

    public long daysInterval(Date date1, Date date2){
        long days = date2.getTime() - date1.getTime();
        days /= 86400000;
        return days;
    }

    public String generateHTML(Date firstDate, Date lastDate){
        long divSize = daysInterval(firstDate, lastDate);
        long tempDay;
        StringBuilder result = new StringBuilder();

        int size = taskList.size();

        for (int i = 0; i < size; i++) {
            tempDay = daysInterval(firstDate, taskList.get(i).getDateStart());
            result.append(taskList.get(i).generateHTML((float)(tempDay * 100) / divSize, divSize, name));
        }

        return result.toString();
    }
}