public class Player {
    public static void main(String args[])
    {
        Groups groups = new Groups();
        groups.SetSizeA();
        groups.SetSizeB();
        groups.AddInGroupB();
        groups.AddInGroupA();
        groups.Draw();
       groups.ShowGroups();

    }
}
