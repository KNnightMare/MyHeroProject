package com.qa.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	@NotNull(message = "Please set the race for your Hero")
	private String race;

	@Column
	@NotNull(message = "Please set the class for your Hero")
	private String _class;

	@Column(unique = true)
	@Size(min = 4, max = 16)
	@NotNull(message = "Please give your Hero a name")
	private String name;

	@Column
	@NotNull(message = "Please insert an age for your Hero")
	@Min(1)
	@Max(99)
	private long age;

//	Default Constructor
	public Hero() {

	}

//	For Creating
	public Hero(String race, String _class, String name, long age) {
		super();
		this.race = race;
		this._class = _class;
		this.name = name;
		this.age = age;
	}

//	For Testing
	public Hero(long id, String race, String _class, String name, long age) {
		super();
		this.id = id;
		this.race = race;
		this._class = _class;
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(_class, age, id, name, race);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return Objects.equals(_class, other._class) && age == other.age && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(race, other.race);
	}

}
