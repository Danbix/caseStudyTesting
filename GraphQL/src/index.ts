import { ApolloServer } from '@apollo/server';
import { startStandaloneServer } from '@apollo/server/standalone';
import { resolvers } from './resolvers.js';
import * as fs from 'fs';
import * as path from 'path';
import { sequelize } from './models.js';


import { fileURLToPath } from 'url';
import { dirname } from 'path';


const __filename = fileURLToPath(import.meta.url);

const __dirname = dirname(__filename);

const typeDefs = fs.readFileSync(path.join(__dirname, '/../', 'schema.graphql'), 'utf-8');



(async () => {
    try {

      await sequelize.authenticate();
      console.log('Database connected successfully!');
  
      await sequelize.sync();
  
      const server = new ApolloServer({
        typeDefs,
        resolvers,
      });
  
      const { url } = await startStandaloneServer(server, {
        listen: { port: 4000 },
      });
  
      console.log(`🚀 Server ready at: ${url}`);
    } catch (error) {
      console.error('Error starting server:', error);
    }
  })();
