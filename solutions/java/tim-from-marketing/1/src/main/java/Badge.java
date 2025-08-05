class Badge {

    public String print(Integer id, String name, String department) {
        if (id == null) {
            return String.format("%s - %s", name, (department == null) ? "OWNER" : department.toUpperCase());
        }
        return String.format("[%d] - %s - %s", id, name, (department == null) ? "OWNER" : department.toUpperCase());
    }

}
