package org.hibernate.metamodel.internal;


import java.util.Set;

public class Table {
	private Long id;
	private Set<Leg> legs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Leg> getLegs() {
		return legs;
	}

	public void setLegs(Set<Leg> legs) {
		this.legs = legs;
	}
}
