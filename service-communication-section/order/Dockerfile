FROM gradle:jdk21 AS build
WORKDIR /app
COPY . /app
RUN chmod +x ./gradlew 
RUN ./gradlew build


FROM eclipse-temurin:21-jdk
COPY --from=build /app/build/libs/order-0.0.1-SNAPSHOT.jar ./order.jar
CMD [ "java", "-jar", "order.jar" ]
# イメージからコンテナ作成時にはこのCMDにあるコマンドがデフォルトで実行されるが、
# ECSのタスク定義でService Connectを使用する際にはサービス間のサイドカーコンテナとして機能しているプロキシコンテナに
# 今回の場合はinventoryサービスのコンテナを知ってもらう必要がある
# なのでタスク定義画面のDocker設定にコマンドの設定をする

# コマンド
# java -jar order.jar --inventory.client.url=http://inventory-8080-tcp.my-app-cluster:8080/api/inventories
