package org.hibernate.metamodel.internal;

import org.hibernate.testing.junit4.BaseCoreFunctionalTestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetamodelImplTest extends BaseCoreFunctionalTestCase {

	@Override
	protected String[] getMappings() {
		return new String[] {
				"org/hibernate/metamodel/internal/Table.hbm.xml"
		};
	}

	@Override
	protected String getBaseForMappings() {
		return "";
	}

	@Test
	public void shouldReturnOnlyOneImplementor() {
		// when
		String[] implementors = sessionFactory().getMetamodel().getImplementors("org.hibernate.metamodel.internal.Table");
		// then
		assertEquals( 1, implementors.length );
	}
}