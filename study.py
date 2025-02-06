nomeHéroi = input("Digite o nome do seu héroi: ")
xp = int(input("Digite o nível de experiência: "))
if xp == 1000:
	xp = "ferro"
if xp > 1000 and xp < 2000:
	xp = "bronze"
if xp == 2000:
	xp = "prata"
if xp == 4000:
	xp = "ouro"
if xp == 5000:
	xp = "platina"
if xp == 6000:
	xp = "diamante"
if xp == 7000:
	xp = "mestre"
if xp == 8000:
	xp = "grão-mestre"
if xp == 9000:
	xp = "desafiante"
if xp == 10000:
	xp = "radiante"
print("Olá, " + nomeHéroi + "! Seu nível de experiência é " + xp + ".")

def vitorias():
	vitórias = int(input("Digite o número de vitórias: "))
	if vitórias < 10:
		print("Você é um jogador iniciante.")
	if vitórias >= 10 and vitórias < 20:
		print("Você é um jogador fodastico.")
	if vitórias >= 20:
		print("Você é um jogador veterano.")
vitorias()