package gantt;

import java.util.Date;

public class Task {
    private String description;
    private Date dateStart;
    private String nameResp;
    private String percent = "0";
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = new Date(dateStart);
    }

    public void setNameResp(String nameResp) {
        this.nameResp = nameResp;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getDateStart() {
        return dateStart;
    }

    @Override
    public String toString() {
        return "\nTask{" +
                "description='" + description + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", nameResp='" + nameResp + '\'' +
                ", percent='" + percent + '\'' +
                ", duration='" + duration + '\'' +
                "}";
    }

    public String generateHTML(float margin, long totalDays, String theme){
        String event = String.format(" onmousemove=\"showInfo('%s','%s','%s','%s','%s','%s')\" onmouseout=\"offInfo()\"", theme, nameResp, duration, percent, dateStart, description);
        String style = "style='margin-left:" + margin + "%; width:" + ((float)(Integer.parseInt(duration) * 100) / totalDays) + "%;'";
        return "<div class=\"task\" " + style + event + "><div class=\"percent\" style='width:" + percent + "%'></div></div>\n";
    }
}