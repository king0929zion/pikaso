.class public final LE/e;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LE/e;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/e;->c:LE/e;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 4

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LD/c;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LD/x0;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, LD/x0;

    iget-object v1, v1, LD/x0;->a:LD/w0;

    iget-object p4, p4, LD/s;->c:Ljava/lang/Object;

    check-cast p4, Ljava/util/ArrayList;

    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget p4, p3, LD/D0;->n:I

    if-nez p4, :cond_2

    iget p4, p3, LD/D0;->i:I

    iget v1, p3, LD/D0;->j:I

    invoke-virtual {p3, p2}, LD/D0;->c(LD/c;)I

    move-result p2

    iget-object v2, p3, LD/D0;->b:[I

    add-int/lit8 v3, p2, 0x1

    invoke-virtual {p3, v3}, LD/D0;->p(I)I

    move-result v3

    invoke-virtual {p3, v2, v3}, LD/D0;->f([II)I

    move-result v2

    iput v2, p3, LD/D0;->i:I

    iput v2, p3, LD/D0;->j:I

    invoke-virtual {p3, v0, p2}, LD/D0;->s(II)V

    if-lt p4, v2, :cond_1

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    iget-object p2, p3, LD/D0;->c:[Ljava/lang/Object;

    aput-object p1, p2, v2

    iput p4, p3, LD/D0;->i:I

    iput v1, p3, LD/D0;->j:I

    return-void

    :cond_2
    const-string p1, "Can only append a slot if not current inserting"

    invoke-static {p1}, LD/d;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "anchor"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "value"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
