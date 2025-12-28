.class public abstract Lo0/X0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lo0/X0;->a:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final a(Landroid/content/Context;)LB2/E;
    .locals 9

    sget-object v0, Lo0/X0;->a:Ljava/util/LinkedHashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v1, "animator_duration_scale"

    invoke-static {v1}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v5, 0x6

    invoke-static {v2, v1, v5}, LA2/i;->a(III)LA2/b;

    move-result-object v6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, LZ0/d;->p(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v1

    new-instance v5, Lk1/a;

    invoke-direct {v5, v6, v1}, Lk1/a;-><init>(LA2/b;Landroid/os/Handler;)V

    new-instance v1, Lo0/W0;

    const/4 v8, 0x0

    move-object v2, v1

    move-object v7, p0

    invoke-direct/range {v2 .. v8}, Lo0/W0;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lk1/a;LA2/b;Landroid/content/Context;Lg2/d;)V

    new-instance v2, LA/t;

    invoke-direct {v2, v1}, LA/t;-><init>(Lo2/e;)V

    new-instance v1, LD2/d;

    new-instance v3, Ly2/i0;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ly2/V;-><init>(Ly2/S;)V

    sget-object v4, Ly2/B;->a:LF2/d;

    sget-object v4, LD2/o;->a:Lz2/c;

    invoke-static {v3, v4}, LZ0/d;->K(Lg2/g;Lg2/i;)Lg2/i;

    move-result-object v3

    invoke-direct {v1, v3}, LD2/d;-><init>(Lg2/i;)V

    new-instance v3, LB2/D;

    const-wide/16 v4, 0x0

    const-wide v6, 0x7fffffffffffffffL

    invoke-direct {v3, v4, v5, v6, v7}, LB2/D;-><init>(JJ)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v5, "animator_duration_scale"

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v4, v5, v6}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v2, v1, v3, v4}, LB2/w;->e(LA/t;LD2/d;LB2/D;Ljava/lang/Float;)LB2/s;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v1, LB2/E;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static final b(Landroid/view/View;)LD/q;
    .locals 1

    const v0, 0x7f080048

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LD/q;

    if-eqz v0, :cond_0

    check-cast p0, LD/q;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
