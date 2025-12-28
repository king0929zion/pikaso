.class public final Lz/y;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# static fields
.field public static final e:Lz/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp2/h;-><init>(I)V

    sput-object v0, Lz/y;->e:Lz/y;

    return-void
.end method


# virtual methods
.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lz/e;->a:Lz/e;

    return-object v0
.end method
