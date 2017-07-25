# Gantt Diagram Language
A language compiler for generate gantt diagram, builted with [Antlr](http://www.antlr.org/) and Java on IntelliJ.

language syntax:

```
begin
    [setInterval {days}]    -- optional, default interval 30 days

    createTheme {project-theme} {
        createTask {task-name} {
            dataIni :   {start date of the task}
            duracao :   {duration in days}
            nomeResp :  {people responsable for the task}
        }

        ...

    }

    ...

end
```

Examples of code using this grammar:
- [example 1](/src/grammar/GrammarTest1.txt)
- [example 2](/src/grammar/GrammarTest2.txt)
- [example 3](/src/grammar/GrammarTest3.txt)

The program uses the input stream directly, so, copy and paste the example, or your code, and use ``` Ctrl + D ``` to finish the input. After run the main program is generated a file on project directory named ``` Gantt Diagram.html ``` as result of compile process with a graphical visualization of the gantt diagram.

<p align="center"><img src="/img/GanttViewer.png"></p>
