package models;

import lombok.Getter;
import lombok.Setter;

public class Prelation extends Subject {
    @Getter @Setter int _prelationSubject;


    public Prelation(int _idSubject, int _prelationSubject) {
        super(_idSubject);
        this._prelationSubject = _prelationSubject;
    }
}
