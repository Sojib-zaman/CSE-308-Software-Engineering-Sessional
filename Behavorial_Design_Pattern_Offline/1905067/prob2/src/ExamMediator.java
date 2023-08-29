public interface ExamMediator {
    public void MarksToController( int[] Ex_marks);
    public void MarksToStudentsAndPublish(int marks , int SID);
    public void StdAskedForRecheck(int SID);
}
