.class public final LE/s;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE/s;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, LE/y;-><init>(III)V

    sput-object v0, LE/s;->c:LE/s;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 1

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, LE/z;->a(I)I

    move-result p3

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, LE/z;->a(I)I

    move-result p1

    iget-object p2, p2, LB0/a;->d:Ljava/lang/Object;

    check-cast p2, Ln0/z;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p1, :cond_1

    add-int/2addr p1, p3

    add-int/lit8 p1, p1, -0x1

    if-gt p3, p1, :cond_0

    :goto_0
    iget-object p4, p2, Ln0/z;->h:LB2/i;

    iget-object v0, p4, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, LF/d;

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Ln0/z;

    invoke-virtual {p2, v0}, Ln0/z;->y(Ln0/z;)V

    iget-object v0, p4, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, LF/d;

    invoke-virtual {v0, p1}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object v0

    iget-object p4, p4, LB2/i;->f:Ljava/lang/Object;

    check-cast p4, LA0/c;

    invoke-virtual {p4}, LA0/c;->c()Ljava/lang/Object;

    check-cast v0, Ln0/z;

    if-eq p1, p3, :cond_0

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "count ("

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") must be greater than 0"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZ0/d;->R(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "removeIndex"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "count"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LE/y;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
