package com.pet.modelo;


public class Responsavel {
    private String nome;
        private String email;
        private String telefone;
        private String senha;
        
        @Deprecated
        public Responsavel() {
        }

        public Responsavel(String nome, String email, String telefone, String senha) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.senha = senha;
        }
        
        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }
        public String getTelefone() {
            return telefone;
        }
        public String getSenha() {
            return senha;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public void setSenha(String senha) {
            this.senha = senha;
        }





        @Override
        public String toString() {
            return "Responsavel [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha
                    + "]";
        }





        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((email == null) ? 0 : email.hashCode());
            result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
            result = prime * result + ((senha == null) ? 0 : senha.hashCode());
            return result;
        }





        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Responsavel other = (Responsavel) obj;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (email == null) {
                if (other.email != null)
                    return false;
            } else if (!email.equals(other.email))
                return false;
            if (telefone == null) {
                if (other.telefone != null)
                    return false;
            } else if (!telefone.equals(other.telefone))
                return false;
            if (senha == null) {
                if (other.senha != null)
                    return false;
            } else if (!senha.equals(other.senha))
                return false;
            return true;
        }






        
        
        
      
}
