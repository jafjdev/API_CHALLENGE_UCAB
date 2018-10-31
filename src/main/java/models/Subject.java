package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Subject {
  @Getter @Setter private String _code; // EX : FING-00018 UCAB-00007
  @Getter @Setter private String _name;
  @Getter @Setter private int _credits;
  @Getter @Setter private String _type; // TA - 4
}
