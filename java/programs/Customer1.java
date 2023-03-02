package com.java.programs;

public class Customer1 implements Comparable<Customer1>
{
		int id;
		String name;
		private String getName() {
			// TODO Auto-generated method stub
			return name;
		}
		private int getId() {
			// TODO Auto-generated method stub
			return id;
		}
		public Customer1(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + id;
			return id;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + "]";
		}
		@Override
		public boolean equals(Object obj) {
			
			return this.id==obj.hashCode();
			
		}
		@Override
		public int compareTo(Customer1 obj)
		{
			if(this.id==obj.getId())
			{
				return 0;
			}
			else if(name.compareTo(obj.getName())<0)
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
		
		
		
}
