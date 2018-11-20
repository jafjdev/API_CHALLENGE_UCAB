package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Subject {
    @Getter @Setter private int _idSubject;
    //@Getter @Setter private String _codeSubject; // EX : FING-00018 UCAB-00007
    @Getter @Setter private String _nameSubject;
    @Getter @Setter private String _creditsSubject;
    //@Getter @Setter private int _prelationSubject;
    //@Getter @Setter private String _typeSubject; // TA - 4
    //@Getter @Setter private ArrayList<Subject> _subjects = new ArrayList<Subject>();


    public Subject(int _idSubject) {
        this._idSubject = _idSubject;
    }
}
