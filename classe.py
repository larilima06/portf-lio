class hero:
    def __init__(self, nome, idade, tipo):
        self.nome = nome
        self.idade = idade
        self.tipo = tipo.lower()

    def atacar(self):
        ataques = {
            "mago": "usou magia",
            "guerreiro": "usou espada",
            "monge": "usou artes marciais",
            "ninja": "usou shuriken"
        }

        ataque = ataques.get(self.tipo, "fez um ataque desconhecido")
        print(f"O {self.tipo} atacou usando {ataque}.")
