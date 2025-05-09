type LinksProps = {
  children: React.ReactNode;
  classe?: string;
};

export function Links({ children, classe }: LinksProps) {
  return <a className={classe}>{children}</a>;
}
