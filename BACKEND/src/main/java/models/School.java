package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class School {
  @Getter @Setter private int _idSchool;
  @Getter @Setter String _nameSchool;
}
