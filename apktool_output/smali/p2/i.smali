.class public final Lp2/i;
.super Lp2/j;
.source "SourceFile"

# interfaces
.implements Lv2/c;
.implements Lo2/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    sget-object v1, Lp2/a;->d:Lp2/a;

    const-class v2, Lt0/p;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final b()Lv2/a;
    .locals 1

    sget-object v0, Lp2/p;->a:Lp2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final g()V
    .locals 2

    iget-boolean v0, p0, Lp2/l;->j:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp2/l;->f()Lv2/a;

    move-result-object v0

    if-eq v0, p0, :cond_0

    check-cast v0, Lv2/c;

    check-cast v0, Lp2/i;

    invoke-virtual {v0}, Lp2/i;->g()V

    return-void

    :cond_0
    new-instance v0, Lc2/f;

    const-string v1, "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Kotlin reflection is not yet supported for synthetic Java properties"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lp2/i;->g()V

    const/4 p1, 0x0

    throw p1
.end method
