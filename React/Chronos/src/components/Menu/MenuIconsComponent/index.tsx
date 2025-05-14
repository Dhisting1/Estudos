type LinksProps = {
  children: React.ReactNode;
  classe?: string;
  ariaLabel?: string;
  title?: string;
  onClick?: (event: React.MouseEvent<HTMLAnchorElement>) => void;
  href?: string;
};

export function Links({
  children,
  ariaLabel,
  title,
  classe,
  onClick,
  href,
}: LinksProps) {
  return (
    <a
      className={classe}
      aria-label={ariaLabel}
      title={title}
      href={href}
      onClick={onClick}
    >
      {children}
    </a>
  );
}
