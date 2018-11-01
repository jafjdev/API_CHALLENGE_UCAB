package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
public class Subject {
  @Getter @Setter private int _idSubject;
  @Getter @Setter private String _codeSubject; // EX : FING-00018 UCAB-00007
  @Getter @Setter private String _nameSubject;
  @Getter @Setter private int _creditsSubject;
  @Getter @Setter private String _typeSubject; // TA - 4
  @Getter @Setter private ArrayList<Subject> _subjects = new ArrayList<Subject>();
}
