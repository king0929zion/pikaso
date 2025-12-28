.class public final LE/p;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/p;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LE/p;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/p;->c:LE/p;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 5

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, LE/z;->a(I)I

    move-result p3

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, LE/z;->a(I)I

    move-result p4

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, LE/z;->a(I)I

    move-result p1

    iget-object p2, p2, LB0/a;->d:Ljava/lang/Object;

    check-cast p2, Ln0/z;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p3, p4, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_3

    if-le p3, p4, :cond_1

    add-int v1, p3, v0

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    if-le p3, p4, :cond_2

    add-int v2, p4, v0

    goto :goto_2

    :cond_2
    add-int v2, p4, p1

    add-int/lit8 v2, v2, -0x2

    :goto_2
    iget-object v3, p2, Ln0/z;->h:LB2/i;

    iget-object v4, v3, LB2/i;->e:Ljava/lang/Object;

    check-cast v4, LF/d;

    invoke-virtual {v4, v1}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v4, v3, LB2/i;->f:Ljava/lang/Object;

    check-cast v4, LA0/c;

    invoke-virtual {v4}, LA0/c;->c()Ljava/lang/Object;

    check-cast v1, Ln0/z;

    iget-object v3, v3, LB2/i;->e:Ljava/lang/Object;

    check-cast v3, LF/d;

    invoke-virtual {v3, v2, v1}, LF/d;->a(ILjava/lang/Object;)V

    invoke-virtual {v4}, LA0/c;->c()Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Ln0/z;->A()V

    invoke-virtual {p2}, Ln0/z;->t()V

    invoke-virtual {p2}, Ln0/z;->r()V

    :goto_3
    return-void
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "from"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "to"

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "count"

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, LE/y;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
