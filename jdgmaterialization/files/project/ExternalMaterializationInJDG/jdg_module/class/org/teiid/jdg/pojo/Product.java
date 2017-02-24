package org.teiid.jdg.pojo;
/**
* Maps a relational database table Product to a java object, Product
*
* 
*
* @author	ReverseEngineer
*/
import java.io.Serializable;
import java.sql.*;
import java.util.*;
import org.infinispan.protostream.annotations.ProtoDoc;
import org.infinispan.protostream.annotations.ProtoField;

public class Product implements Serializable {

	
	public java.lang.Long m_Itemid;

	
	public java.lang.Double m_Price;

	
	public java.lang.String m_Name;

	
	public java.lang.String m_Description;


	@ProtoField(number = 1, required = true)
	public java.lang.Long getItemid( ) { 		return this.m_Itemid;	}

	public void setItemid( java.lang.Long itemid) { 		 this.m_Itemid = itemid; 	}

	@ProtoField(number = 4, required = false)
	public java.lang.Double getPrice( ) { 		return this.m_Price;	}

	public void setPrice( java.lang.Double price) { 		 this.m_Price = price; 	}

	@ProtoField(number = 2, required = false)
	public java.lang.String getName( ) { 		return this.m_Name;	}

	public void setName( java.lang.String name) { 		 this.m_Name = name; 	}

	@ProtoField(number = 3, required = false)
	public java.lang.String getDescription( ) { 		return this.m_Description;	}

	public void setDescription( java.lang.String description) { 		 this.m_Description = description; 	}
	public String toString()  {
		StringBuffer output = new StringBuffer();
		output.append("itemid:");
		output.append(getItemid());
		output.append("\n");
		output.append("price:");
		output.append(getPrice());
		output.append("\n");
		output.append("name:");
		output.append(getName());
		output.append("\n");
		output.append("description:");
		output.append(getDescription());
		output.append("\n");

		return output.toString();
	}

} // class Product
