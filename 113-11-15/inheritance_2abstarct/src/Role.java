public abstract class Role { //抽象類別
        private String name;
        private int level;
        private int blood;

        public int getBlood() {
            return blood;
        }

        public void setBlood(int blood) {
            this.blood = blood;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public abstract void fight();
}
