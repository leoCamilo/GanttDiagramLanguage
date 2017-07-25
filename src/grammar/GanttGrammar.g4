grammar GanttGrammar;

@header {
    import gantt.*;
    import java.util.ArrayList;
}

program returns [Diagram diagram] @init {$diagram = new Diagram(); }:
    BEGIN
    (interval = set_interval {$diagram.setInterval($interval.result);})?
    themes = theme_list {$diagram.setThemeList($themes.themeList);}
    END
;

set_interval returns [Integer result]:
    INTERVAL_WORD INT {$result = Integer.parseInt($INT.text);}
;

theme_list returns [ArrayList<Theme> themeList] @init { $themeList = new ArrayList<Theme>();}:
    (tempTheme = theme {$themeList.add($tempTheme.myTheme);})+
;

theme returns [Theme myTheme] @init { $myTheme = new Theme(); }:
    THEME_WORD
    WORD LBRACE {$myTheme.setName($WORD.text);}
    tl = task_list {$myTheme.addTasks($tl.taskList);}
    RBRACE
;

task_list returns [ArrayList<Task> taskList] @init { $taskList = new ArrayList<Task>(); }:
    (t = task {$taskList.add($t.finalTask);})+
;

task returns [Task finalTask]:
    TASK_WORD
    WORD LBRACE
    info = task_info {$info.myTask.setDescription($WORD.text); $finalTask = $info.myTask;}
    RBRACE
;

task_info returns [Task myTask] @init { $myTask = new Task(); } :
    BEGIN_DATE COLON DATE   {$myTask.setDateStart($DATE.text);}
    DURATION COLON INT      {$myTask.setDuration($INT.text);}
    NAME_RESP COLON WORD    {$myTask.setNameResp($WORD.text);}
   (PERCENT COLON INT       {$myTask.setPercent($INT.text);})?
;

BEGIN_DATE  :'dataIni';
DURATION    :'duracao';
NAME_RESP   :'nomeResp';
PERCENT     :'percent';

BEGIN   :'begin';
END     :'end';

WS      :[ \t\r\n]+ -> skip;

INT     :NUM+;
NUM     :[0-9];
WORD    :[a-z]+;
DATE    : INT BAR INT BAR INT;

THEME_WORD    :'createTheme';
TASK_WORD     :'createTask';
INTERVAL_WORD :'setInterval';

LBRACE  :'{';
RBRACE  :'}';
COLON   :':';
BAR     :'/';