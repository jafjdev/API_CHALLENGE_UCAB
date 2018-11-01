package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Faculty {
  @Getter @Setter int _idFaculty;
  @Getter @Setter String _nameFaculty;
}
