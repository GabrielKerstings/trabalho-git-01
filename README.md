# **Manual de instalação e intruções de uso**

> Desenvolvido por: Guilherme Carvalho Silva, Emanuel Pereira (insira seu nome aqui...)

# Primeiros passos

## Instalação para Windows:

_Para facilitar o processo de instalação no windows, instale o wsl. Você pode verificar o passo-a-passo completo [aqui](https://pureinfotech.com/install-windows-subsystem-linux-2-windows-10/)._

_(reinicie o computador para as mudanças surtirem efeito)_

### 1. Instalando o node

```sh
# atualizando os pacotes locais
sudo apt update
```

```sh
# instalando node 16
sudo apt install nodejs
```

Verifique a instalação foi bem-sucedida:

```sh
nodejs -v
```

```sh
# Output:
v10.19.0
```

por fim, instale o npm:

```sh
# instalando npm lts
sudo apt install npm
```

```sh
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.1/install.sh | bash
```

```sh
export NVM_DIR="$([ -z "${XDG_CONFIG_HOME-}" ] && printf %s "${HOME}/.nvm" || printf %s "${XDG_CONFIG_HOME}/nvm")"
[ -s "$NVM_DIR/nvm.sh" ] && . "$NVM_DIR/nvm.sh"
```

```sh
## install node 16
nvm install 16
```

```sh
nvm use 16
```

<br/>

### 2. Instalando as depêndencias de projeto

```sh
# instalando o yarn
npm i -g yarn
```

_(feche e abra o terminal para as mudanças surtirem efeito)_

entre na pasta raiz do projeto e execute

```sh
yarn
```

<br/>

## Realizando o primeiro commit

> Com as dependências instaladas, você pode ter dificuldades para enviar um commit despadronizado. Isso porque os commits desse projeto seguem as [convensões de commit do Angular](https://github.com/conventional-changelog/commitlint/tree/master/@commitlint/config-conventional#type-enum). Os commit devem estar dentro do padrão para serem aprovados.

Em geral, o commit deverá seguir o seguinte padrão:

```sh
tipo(escopo?): mensagem  #escopo é opicional, porem é recomendável explicitar se a mudança está no server ou client
```

Exemplos reais de commit:

```sh
build: first commit
```

```sh
fix(server): send cors headers
```

```sh
feat(client): add comment section
```

O corpo do commit deve possuir um tipo. Os tipos válidos são:

- **`build`** : Mudanças de build geralmente são referentes à adição de dependências externas.
- **`chore`** : Mudanças em arquivos de configuração que não estão no src ou test
- **`ci`** : Mudanças de arquivos de script
- **`docs`** : Mudanças de documentação
- **`feat`** : Adicionando uma nova funcionalidade
- **`fix`** : Arrumando um bug
- **`perf`** : Um mudança de código que melhora a performance
- **`refactor`** : Refatoramentos de trechos de código
- **`revert`** : Revertendo mudanças em trechos de código
- **`style`** : Mudanças que não afetam o significado do código mas o tornam mais belo (espaços em branco, formatação, etc...)
- **`test`** : Mudanças em arquivos de teste
