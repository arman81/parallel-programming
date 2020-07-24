public class Main{
	public static void main(String[] args){
	}

	private static class Vault{
		private int password;
		public Vault(int password){
			this.password = password;
		}
		public boolean isCorrect(int password){
			try {
				Thread.sleep(5);

			} catch (InterruptedException e) {
				//TODO: handle exception
			}
			return this.password == password;
		}
	}
}
