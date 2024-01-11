from locust import HttpUser, between, task


class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

    @task
    def userCreate(self):
        payload = {
            "id": 120120120,
            "username": "testilkin12",
            "firstName": "deneme1",
            "lastName": "ilkin1",
            "email": "test1@test.com",
            "password": "test456",
            "phone": "05242424",
            "userStatus": 0
        }
        self.client.post("/v2/user", json=payload)

    @task
    def getUserInfo(self):
        self.client.get("/v2/user/testilkin12")

    @task
    def logout(self):
        self.client.get("/v2/user/logout")

    @task
    def login(self):
        self.client.get("/v2/user/login?username=admin&password=admin")

    @task
    def deleteUser(self):
        self.client.delete("/v2/user/testilkin12")

    @task
    def updateUser(self):
        body = {
            "id": 121121,
            "username": "denemeilkin",
            "firstName": "deneme",
            "lastName": "ilkin2",
            "email": "test2@test.com",
            "password": "test456",
            "phone": "05242424",
            "userStatus": 0
        }
        self.client.put("/v2/user/denemeilkin", json=body)

    @task
    def createWithList(self):
        payload = [
                {
                    "id": 123123,
                    "username": "denemeilkin3",
                    "firstName": "ilkin3",
                    "lastName": "deneme",
                    "email": "test3@test.com",
                    "password": "test123",
                    "phone": "05252525",
                    "userStatus": 0
                },
                {
                    "id": 124124,
                    "username": "denemeilkin3",
                    "firstName": "ilkin3",
                    "lastName": "deneme",
                    "email": "test3@test.com",
                    "password": "test123",
                    "phone": "05252525",
                    "userStatus": 0
                }
            ]
        self.client.post("/v2/user/createWithList", json=payload)

    @task
    def createWithArray(self):
        payload = [
            {
                "id": 127127,
                "username": "ilkintest4",
                "firstName": "ilkin",
                "lastName": "test5",
                "email": "test4@test.com",
                "password": "test123",
                "phone": "052727",
                "userStatus": 0
            },
            {
                "id": 128128,
                "username": "ilkintest5",
                "firstName": "ilkin",
                "lastName": "test5",
                "email": "test5@test.com",
                "password": "test123",
                "phone": "052828",
                "userStatus": 0
            }
        ]
        self.client.post("/v2/user/createWithArray", json=payload)








