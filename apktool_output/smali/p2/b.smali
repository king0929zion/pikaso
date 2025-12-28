.class public abstract Lp2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv2/a;
.implements Ljava/io/Serializable;


# instance fields
.field public transient d:Lv2/a;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Class;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/b;->e:Ljava/lang/Object;

    iput-object p2, p0, Lp2/b;->f:Ljava/lang/Class;

    iput-object p3, p0, Lp2/b;->g:Ljava/lang/String;

    iput-object p4, p0, Lp2/b;->h:Ljava/lang/String;

    iput-boolean p5, p0, Lp2/b;->i:Z

    return-void
.end method


# virtual methods
.method public abstract b()Lv2/a;
.end method

.method public final d()Lp2/c;
    .locals 2

    iget-object v0, p0, Lp2/b;->f:Ljava/lang/Class;

    iget-boolean v1, p0, Lp2/b;->i:Z

    if-eqz v1, :cond_0

    sget-object v1, Lp2/p;->a:Lp2/q;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lp2/k;

    invoke-direct {v1, v0}, Lp2/k;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lp2/p;->a(Ljava/lang/Class;)Lp2/d;

    move-result-object v1

    :goto_0
    return-object v1
.end method
