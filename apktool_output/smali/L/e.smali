.class public final LL/e;
.super LI/c;
.source "SourceFile"

# interfaces
.implements LD/j0;


# static fields
.field public static final g:LL/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LL/e;

    sget-object v1, LI/n;->e:LI/n;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI/c;-><init>(LI/n;I)V

    sput-object v0, LL/e;->g:LL/e;

    return-void
.end method


# virtual methods
.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LD/k0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LD/k0;

    invoke-super {p0, p1}, LI/c;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LD/O0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LD/O0;

    invoke-super {p0, p1}, Ld2/e;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LD/k0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LD/k0;

    invoke-super {p0, p1}, LI/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/O0;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LD/k0;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, LD/k0;

    check-cast p2, LD/O0;

    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/O0;

    return-object p1
.end method
