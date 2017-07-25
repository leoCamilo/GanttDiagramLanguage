package gantt;

import java.util.ArrayList;
import java.util.Date;

public class Diagram {
    private int interval = 30;
    private ArrayList<Theme> themesList;

    private Date olderDate;
    private Date earlierDate;

    public long daysInterval(){
        long days = olderDate.getTime() - earlierDate.getTime();
        days /= 86400000;
        return days;
    }

    public void setInterval(int interval){
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "Diagram{" +
                "interval=" + interval +
                " older date: " + olderDate +
                " earlier date: " + earlierDate +
                " days interval: " + daysInterval() +
                ", themesList=" + themesList +
                '}';
    }

    public void setThemeList(ArrayList<Theme> themeList){
        this.themesList = themeList;

        Date older, earlier, tempDate;
        older = themesList.get(0).getOlderDate();
        earlier = themesList.get(0).getEarlierDate();

        for (int i = themesList.size() - 1; i != 0; i--){
            tempDate = themesList.get(i).getOlderDate();
            if (older.before(tempDate))
                older = tempDate;

            tempDate = themesList.get(i).getEarlierDate();
            if (earlier.after(tempDate))
                earlier = tempDate;
        }

        olderDate = older;
        earlierDate = earlier;
    }

    public String generateHTML(){
        StringBuilder result = new StringBuilder();
        String pag = "<html><head><title>Gantt Diagram</title><link rel='stylesheet' href='style.css'></head><script>function showInfo(t, n, d, p, ds, desc){var x = event.clientX;    var y = event.clientY;var element = document.getElementById('infoBox');element.style.visibility = 'visible';element.style.left = x + 'px';element.style.top = y + 1 + 'px';var text = '<b>Tema:</b> ' + t + '<br><b>Nome Responsavel:</b> ' + n + '<br><b>Data Inicio:</b> ' + ds + '<br><b>Duracao:</b> ' + d + ' dias<br><b>Porcentagem concluida:</b> ' + p + '%<br><b>Descricao:</b> ' + desc; element.innerHTML = text;}function offInfo(){var element = document.getElementById('infoBox');element.style.visibility = 'hidden';}</script></script><body><div id='diagram'>";
        result.append(pag);
        int size = themesList.size();

        for (int i = 0; i < size; i++)
            result.append(themesList.get(i).generateHTML(earlierDate, olderDate));

        result.append("</div><div id='infoBox'></div></body></html>");
        float inte = (float) (interval * 100)/daysInterval();

        for (float i = inte; i < 100; i += inte)
            result.append("<div class='division' style=\"left: " + i + "%\"></div>");

        return result.toString();
    }
}