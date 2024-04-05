import json

def generate_bulk_commands(json_file, index_name, output_file):
    bulk_commands = []
    with open(json_file, 'r') as file:
        data = json.load(file)
        for obj in data:
            # Generate the index operation
            bulk_commands.append('{"index":{"_index":"%s"}}' % index_name)
            # Add the JSON object
            bulk_commands.append(json.dumps(obj))
    
    # Write the bulk commands to the output file
    with open(output_file, 'w') as outfile:
        outfile.write('\n'.join(bulk_commands))

def main():
    # Path to your JSON file
    json_file = 'IMDB_crawled.json'
    # Elasticsearch index name
    index_name = 'imdb'
    # Output file to write bulk commands
    output_file = 'bulk_commands.txt'
    
    # Generate and write the bulk commands
    generate_bulk_commands(json_file, index_name, output_file)
    print("Bulk commands written to:", output_file)

if __name__ == "__main__":
    main()
