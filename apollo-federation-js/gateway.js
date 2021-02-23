const { ApolloServer } = require("apollo-server");
const { ApolloGateway } = require("@apollo/gateway");

const gateway = new ApolloGateway({
    serviceList: [
        { name: "user", url: "http://localhost:5001/graphql" },
        { name: "issues", url: "http://localhost:5002/graphql" }
    ],

    // Experimental: Enabling this enables the query plan view in Playground.
    __exposeQueryPlanExperimental: true,
});

(async () => {
    const server = new ApolloServer({
        gateway,

        engine: false,

        subscriptions: false,
    });

    server.listen().then(({ url }) => {
        console.log(`🚀 Server ready at ${url}`);
    });
})();