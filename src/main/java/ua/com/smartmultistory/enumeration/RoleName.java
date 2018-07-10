package ua.com.smartmultistory.enumeration;

public enum RoleName {
	GUEST,
	STAFF,
	USER,
	MODERATOR,
	ADMIN;

	public static int indexOf(RoleName name) {
		for (int i = 0; i < values().length; ++i)
			if (values()[i].equals(name))
				return i;
		return -1;
	}
}
